class Reposts(
    val repostId: Int,
    val count: Int,
    val userReposted: Boolean = false,
    repostAuthorId: Int
): Post(
    id = 0,
    ownerId = 0,
    formId = 0,
    createdBy = 0,
    date = 0,
    text = "",
    replyOwnerId = 0,
    replyPostId = 0,
    friendsOnly = false,
    comments = Comments(),
    copyright = Copyright(),
    likes = Likes(),
    reposts = Reposts(),
    views = Views(),
    postType = PostType.post,
    postSource = PostSource(),
    //    attachment: Array,
    geo = Geo(),
    singerId = 0,
    canPin = false,
    canDelete = true,
    canEdit = true,
    isPined = false,
    markedAsAds = false,
    isFavorite = false,
    donut = Donut(),
    postponedId = 0
) {

    var repostAuthorId:Int = repostAuthorId
        get() = field
        set(value) {
            field = if (userReposted) value else 0
        }
}
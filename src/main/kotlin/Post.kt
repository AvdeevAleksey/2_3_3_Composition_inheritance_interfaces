class Post(
    val id: Int = 0,
    internal val ownerId: Int = 0,
    val formId: Int = 0,
    val createdBy: Int = 0,
    internal val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts(),
    val views: Views = Views(),
    val postType: PostType = PostType.post,
    val postSource: PostSource = PostSource(),
//    val attachment: Array,
    val geo: Geo = Geo(),
    val singerId: Int = 0,
    val copyHistory: Array<Reposts> = copyHistory(),
    val canPin: Boolean = false,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPined: Boolean = false,
    val markedAsAds:Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut = Donut(),
    val postponedId: Int = 0
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}

fun repost(post: Post): Boolean {
    if (post is Reposts) {
        post.repostId
            return true
    } else return false
}

fun copyHistory(): Array<Reposts> {
    return reposts += repost()
}

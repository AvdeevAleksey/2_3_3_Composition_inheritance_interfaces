fun main() {

    val original: Post = Post(
        id=1,
        ownerId = 1,
        0,
        createdBy = 1,
        12345,
        "Это оригинальный пост"
    )

    val repost: Reposts = Reposts(
        1,
        1,
        true,
        repostAuthorId = 12341234
    )

    val service = WallService()
    service.add(repost)

}
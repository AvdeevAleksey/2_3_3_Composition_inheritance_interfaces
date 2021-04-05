class PostSource(
    val type: String = "",
    val platform: String = "",
    data: String = "",
    val url: String = "http://"
) {
    var data = data
        get() = field
        set(value) {
            field = when(type){
                "vk" -> when(value) {
                    PostSourceData.profileActivity.string -> PostSourceData.profileActivity.string
                    PostSourceData.profilePhoto.string -> PostSourceData.profilePhoto.string
                    else -> ""
                }
                "widget" -> when(value) {
                    PostSourceData.comments.string -> PostSourceData.comments.string
                    PostSourceData.like.string -> PostSourceData.like.string
                    PostSourceData.poll.string -> PostSourceData.poll.string
                    else -> ""
                }
                else -> ""
            }
        }
}

enum class PostSourceType(val string: String) {
    vk("vk"),
    widget("widget"),
    api("api"),
    rss("rss"),
    sms("sms")
}

enum class PostSourcePlatform(val string: String) {
    android("android"),
    iphone("iphone"),
    wphone("wphone")
}

enum class PostSourceData(val string: String) {
    profileActivity("profile activity"),
    profilePhoto("profile photo"),
    comments("comments"),
    like("like"),
    poll("poll")
}
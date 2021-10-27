class User (
    var name : String = "",
    var list_post : MutableList<Post> = mutableListOf(),
    var friend_list : MutableList<User> = mutableListOf(),
    ) {
    
    fun get_name () : String {
        return this.name
    }

    fun print() {
        print("Utilisateur : ")
        println(this.name)
    }

    fun print_all_post () {
        for (post in list_post) {
            post.print()
        }
    }

    fun create_post (title : String, message : String) {
            var post = Post(title, this, message)
            this.list_post.add(post)
    }

    fun add_friend (friend : User) {
        this.friend_list.add(friend)
    }

    fun remove_friend(friend : User) {
        this.friend_list.remove(friend)
    }

    fun reply_to_post(post : Post, reply : String) {

    }
}


class Post (
    var title : String,
    var creator : User,
    var message : String
    ) {
    
    fun print () {
        println("Title :" + this.title)
        println("Message : " + this.message)
        println("Author : " + this.creator.get_name())
    }

}


fun main () {
    val jose = User("jose")
    val pierre = User("pierre")
    jose.create_post("titre", "ceci est un message")
    jose.print_all_post()
    jose.add_friend(pierre)
    println(jose.friend_list)
    jose.remove_friend(pierre)
    println(jose.friend_list)
}
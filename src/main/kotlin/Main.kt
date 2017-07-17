fun main(args: Array<String>) {
//    val kronus = KronusOrm("gabi.db")
//    val user = User(email ="ascao@gmail.com", name = "vsó")
//    //kronus.save(user)

//    val users = kronus.allFrom(User::class)
//    val data = MyData(name = "Sanford", age = 19)
//    data.hehe()

//    val kronus = KronusOrm("gabi.db")
//    val user = User(email ="ascao@gmail.com", name = "vsó")
//    //kronus.save(user)
//
//    val users = kronus.allFrom(User::class)
//
//    print(users)
    val user2 = User(email = "alissonmangueira@gmail.com", name = "victor")

    val last = user2.all()?.last() ?: return print("error geting the list")

    var firstUser = last as User
    firstUser.name = "Victor cara de ..."

    firstUser.update()
}
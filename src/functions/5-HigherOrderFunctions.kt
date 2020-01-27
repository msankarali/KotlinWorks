package functions

import java.util.*
import kotlin.concurrent.schedule

fun main() {
    val surName: String = "ANKARALI"

    printUserInfo(getName(), { surName ->
        "surname: $surName"
    }, getAge())

    printUserInfo(getName(), {
        "surname: $it"
    }, getAge())
    //printUserInfo(getName(), surName, getAge())

    getItemClickListener({ buttonName ->
        println("$buttonName tiklandi")
    })

    val news: News = News()
    val newsType = NewsType()
    news.getNewsFromServer("FoxTV", newsType, {
        println(this.toString())
    })
    news.getNewsFromServer("FoxTV", newsType, {
        println(this.toString())
    })

    news.filterNews { filterType, getFilterName ->

    }

    // incelenecek
    val higherOrderFunction = { surName: String ->
        "surName: $surName"
    }

    printUserInfo(getName(), higherOrderFunction, getAge())


    val annonymousFunction = fun(surName: String): String {
        return "surName: $surName"
    } //annonymous fonksiyon

    val annonymousFunction2 = fun(surName: String): String = "surName: $surName"
}

fun getName(): String {
    return "Servet"
}

fun getAge(): Int = 27

fun printUserInfo(name: String, getSurName: (surName: String) -> String = { "dsa" }, age: Int): Unit {
    println("name $name, age: $age")

    println(getSurName("ANKARALI"))
}

//fun getItemClickListener(onClick:(String) -> Unit){
fun getItemClickListener(onClick: (buttonName: String) -> Unit) {
    println("Tiklama islemi baslatiliyor")
    Timer().schedule(3000) {
        onClick("Login")
        println("tiklama islemi bitti")
    }
}

class News {
    fun getNewsType(newsType: Int): String {
        return when (newsType.toString()) {
            NewsType.breakingNews -> "Breaking"
            NewsType.urgentNews -> "Urgent"
            NewsType.localNews -> "Local"
            NewsType.globalNews -> "Global"
            else -> "Normal"
        }
    }
}

class NewsType {
    companion object {
        val breakingNews = "BreakingNews"
        val urgentNews = "Urgent"
        val localNews = "Local"
        val globalNews = "Global"
        val normalNews = "Normal"
    }
}


fun News.getNewsFromServer(channelType: String, newsType: NewsType, getNews: NewsType.(Int) -> Unit) {
    when (channelType) {
        "KanalD" -> {
            getNews(newsType, 1)
        }
        "ShowTV" -> {
            getNews(newsType, 2)
        }
        "Tv8" -> {
            getNews(newsType, 3)
        }
        "FoxTV" -> {
            getNews(newsType, 4)
        }
        "CNN" -> {
            getNews(newsType, 5)
        }
    }
}

infix fun News.filterNews(getFilter: (filterType: String, getFilterName: () -> String) -> Unit) {
    getFilter("filterName") {
        "String return label"
    }
}

// first class citizen kavrami
// inline
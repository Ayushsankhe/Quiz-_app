package ay.ayush.quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2


class ancient_swipe_screen_activity : AppCompatActivity(){
    private  var question_list= mutableListOf<String>()
    private var wronga= mutableListOf<Int>()
    private var righta= mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ancient_swipe_screen)

        posttolist()
        var viewpager: ViewPager2 =findViewById(R.id.view_pager2)
        viewpager.adapter=ViewPageAdapter(question_list,wronga,righta)



    }
    fun addtolist(question:String,wrong:Int,right:Int){
        question_list.add(question)
        wronga.add(wrong)
        righta.add(right)

    }
    fun posttolist(){
        for (i:Int in 1..100){
            addtolist("Q.$i which is the most Populated country?",R.drawable.right_answer,R.drawable.no_answer)
        }
    }
}
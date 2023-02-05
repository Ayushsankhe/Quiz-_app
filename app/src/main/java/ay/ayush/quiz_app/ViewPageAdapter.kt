package ay.ayush.quiz_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import ay.ayush.quiz_app.R

public class ViewPageAdapter( var title:List<String>,var image:List<Int>, var images:List<Int>):
    RecyclerView.Adapter<ViewPageAdapter.Pager2ViewHolder>() {
    inner class Pager2ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview){
        val question:TextView=itemview.findViewById(R.id.question)
        val noanswer:ImageView=itemview.findViewById(R.id.no_answer)
        val rightanswer:ImageView=itemview.findViewById(R.id.right_answer)
        init {
            rightanswer.setOnClickListener{
                v:View->
                val position:Int=adapterPosition
                Toast.makeText(itemview.context,"you clicked on item #${position+1}",Toast.LENGTH_LONG).show()
            }
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPageAdapter.Pager2ViewHolder {
        return  Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.swipe_screen,parent,false))
    }

    override fun getItemCount(): Int {
        return title.size
    }

    override fun onBindViewHolder(holder: ViewPageAdapter.Pager2ViewHolder, position: Int) {
        holder.question.text=title[position]
        holder.rightanswer.setImageResource(image[position])
        holder.noanswer.setImageResource(images[position])
    }
}
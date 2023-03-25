package sv.edu.udb.retrofitapp

import android.view.View
import  androidx.recyclerview.widget.RecyclerView
import sv.edu.udb.retrofitapp.databinding.ItemDogBinding
import com.squareup.picasso.Picasso
import retrofit2.http.Url

class DogViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
    private val itemDogBinding: ItemDogBinding

    init {
        itemDogBinding = ItemDogBinding.bind(view!!)
    }

    fun bind(imageUrl: String?){
        Picasso.get().load(imageUrl).into(itemDogBinding.ivDog)
    }
}
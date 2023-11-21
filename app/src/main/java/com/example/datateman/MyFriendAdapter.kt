package com.example.datateman

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainerView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_friend_item.*

class MyFriendAdapter(private val context: Context,
private val items: ArrayList<MyFriend>):
RecyclerView.Adapter<MyFriendAdapter.ViewHolder>(){
    class ViewHolder(override val containerView: View):
    RecyclerView.ViewHolder(containerView), LayoutContainer{
        fun bindItem(items: MyFriend) {
            txt_friendName.text=items.nama
            txt_friendEmail.text=items.email
            txt_friendTlp.text=items.telp
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder (
        LayoutInflater.from(context).inflate(
            R.layout.my_friend_item, parent, false
        )
    )
}
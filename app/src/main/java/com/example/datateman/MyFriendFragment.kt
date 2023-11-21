package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(MyFriend("Sigib Titi", "sigibtiti@gmail.com", "081234556"))
        listTeman.add(MyFriend("Raullpii", "raulll@gmail.com", "0856789"))
        listTeman.add(MyFriend("Sigib Titi", "sigibtiti@gmail.com", "081234556"))
        listTeman.add(MyFriend("Raullpii", "raulll@gmail.com", "0856789"))
        listTeman.add(MyFriend("Sigib Titi", "sigibtiti@gmail.com", "081234556"))
        listTeman.add(MyFriend("Raullpii", "raulll@gmail.com", "0856789"))
        listTeman.add(MyFriend("Sigib Titi", "sigibtiti@gmail.com", "081234556"))
        listTeman.add(MyFriend("Raullpii", "raulll@gmail.com", "0856789"))
        listTeman.add(MyFriend("Sigib Titi", "sigibtiti@gmail.com", "081234556"))
        listTeman.add(MyFriend("Raullpii", "raulll@gmail.com", "0856789"))
        listTeman.add(MyFriend("Sigib Titi", "sigibtiti@gmail.com", "081234556"))
        listTeman.add(MyFriend("Raullpii", "raulll@gmail.com", "0856789"))
        listTeman.add(MyFriend("Sigib Titi", "sigibtiti@gmail.com", "081234556"))
        listTeman.add(MyFriend("Raullpii", "raulll@gmail.com", "0856789"))
        listTeman.add(MyFriend("Sigib Titi", "sigibtiti@gmail.com", "081234556"))
        listTeman.add(MyFriend("Raullpii", "raulll@gmail.com", "0856789"))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun tampilTeman() {
        rv_ListMyFriend.layoutManager=LinearLayoutManager(activity)
        rv_ListMyFriend.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }
    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
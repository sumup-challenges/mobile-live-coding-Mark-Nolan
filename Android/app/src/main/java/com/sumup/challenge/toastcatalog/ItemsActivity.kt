package com.sumup.challenge.toastcatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ItemsActivity : AppCompatActivity() {

    private lateinit var itemsAdapter: ItemsAdapter
    private val viewModel = ItemListViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        initRecyclerView()
        val scope = CoroutineScope(IO)

        viewModel.getItems()
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        itemsAdapter = ItemsAdapter()
        recyclerView.adapter = itemsAdapter
    }

//    private fun loadData() {
//        val data = NetworkClient().getItems()
//        data?.let {
//            itemsAdapter.updateItems(it)
//        }
//    }

//    fun generateDummyData(): List<Item> {
//        val dummyItems = mutableListOf<Item>()
//        for (i in 1..10) {
//            val item = Item(
//                id = i,
//                name = "Item $i",
//                price = "$${i * 10}"
//            )
//            dummyItems.add(item)
//        }
//        return dummyItems
//    }
}

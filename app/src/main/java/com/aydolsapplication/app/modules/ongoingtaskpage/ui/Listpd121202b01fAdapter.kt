//package com.aydolsapplication.app.modules.ongoingtaskpage.ui
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.aydolsapplication.app.R
//
//import com.aydolsapplication.app.modules.ongoingtaskpage.`data`.model.Listpd121202b01fRowModel
//import kotlin.Int
//import kotlin.collections.List
//
//class Listpd121202b01fAdapter(
//  var list: List<Listpd121202b01fRowModel>
//) : RecyclerView.Adapter<Listpd121202b01fAdapter.RowListpd121202b01fVH>() {
//  private var clickListener: OnItemClickListener? = null
//
//  //override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpd121202b01fVH {
//   // val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpd121202b01f,parent,false)
//    //return RowListpd121202b01fVH(view)
//  //}
//
//  override fun onBindViewHolder(holder: RowListpd121202b01fVH, position: Int) {
//    val listpd121202b01fRowModel = Listpd121202b01fRowModel()
//    // TODO uncomment following line after integration with data source
//    // val listpd121202b01fRowModel = list[position]
//
//  }
//
//  override fun getItemCount(): Int = 4
//  // TODO uncomment following line after integration with data source
//  // return list.size
//
//  public fun updateData(newData: List<Listpd121202b01fRowModel>) {
//    list = newData
//    notifyDataSetChanged()
//  }
//
//  fun setOnItemClickListener(clickListener: OnItemClickListener) {
//    this.clickListener = clickListener
//  }
//
//  interface OnItemClickListener {
//    fun onItemClick(
//      view: View,
//      position: Int,
//      item: Listpd121202b01fRowModel
//    ) {
//    }
//  }
//
//  inner class RowListpd121202b01fVH(
//    view: View
//  ) : RecyclerView.ViewHolder(view) {
//
//  }
//}

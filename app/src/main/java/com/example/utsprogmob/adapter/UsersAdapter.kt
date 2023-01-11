package com.example.utsprogmob.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utsprogmob.R
import com.example.utsprogmob.model.ResponseItem

class UsersAdapter(val users: List<ResponseItem>?):
    RecyclerView.Adapter<UsersAdapter.UsersHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UsersAdapter.UsersHolder {
        return UsersHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_user_item, parent, false))
    }

    override fun onBindViewHolder(holder: UsersAdapter.UsersHolder, position: Int) {
        holder.bindUsers(users?.get(position))
    }

    override fun getItemCount(): Int {
        return users?.size ?: 0
    }

    class UsersHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtNama: TextView
        lateinit var txtEmail: TextView
        lateinit var txtAlamat: TextView
        lateinit var txtNoTelp: TextView

        fun bindUsers(users: ResponseItem?) {
            itemView.apply {
                txtNama = findViewById(R.id.namaMhs)
                txtEmail = findViewById(R.id.email)
                txtAlamat = findViewById(R.id.foto)
                txtNoTelp = findViewById(R.id.nim)

                txtNama.text = users?.name
                txtEmail.text = users?.email

                val address = "${users?.address?.street},${users?.address?.city}, ${users?.address?.suite},${users?.address?.zipcode}"
                txtAlamat.text = address

                txtNoTelp.text = users?.phone
            }
        }
    }
}

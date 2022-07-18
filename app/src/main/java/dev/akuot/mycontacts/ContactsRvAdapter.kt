package dev.akuot.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.akuot.mycontacts.databinding.ContactListItemBinding

class ContactsRvAdapter (var contactList: List<Contacts>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
//      var itemView =LayoutInflater.from(parent.context)
//          .inflate(R.layout.contact_list_item,parent,false)
        var binding=
        ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var contactsViewHolder = ContactsViewHolder(binding)
        return contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContacts =contactList.get(position)
        holder.binding.tvName.text=currentContacts.name
        holder.binding.tvContact.text=currentContacts.phoneNumber
        holder.binding.tvEmail.text=currentContacts.email
        holder.binding.tvAddress.text=currentContacts.address
        Picasso.get()
            .load(currentContacts.image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(300,350)
            .centerCrop()
            .into(holder.binding.ivContact)

        val context =holder.itemView.context
        holder.binding.ivContact.setOnClickListener{
            Toast.makeText(context,"you have clicked on ${currentContacts.name}'s image",Toast.LENGTH_SHORT).show()
        }
        holder.binding.cvContact.setOnClickListener{
            val intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("NAME",currentContacts.name)
            intent.putExtra("EMAIL",currentContacts.email)
            intent.putExtra("ADDRESS",currentContacts.address)
            intent.putExtra("PHONE_NUMBER",currentContacts.phoneNumber)
            intent.putExtra("IMAGE",currentContacts.image)


            context.startActivity(intent)
        }

   }

    override fun getItemCount(): Int {
return contactList.size
    }

}

class ContactsViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root) {
//    var tvName = itemView.findViewById<TextView>(R.id.tvName)
//    var tvContact = itemView.findViewById<TextView>(R.id.tvContact)
//    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
//    var tvAddress = itemView.findViewById<TextView>(R.id.tvAddress)
}


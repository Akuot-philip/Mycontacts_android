package dev.akuot.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import dev.akuot.mycontacts.databinding.ContactListItemBinding

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding= ContactListItemBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        getExtras()
    }
    fun getExtras(){
        val extras =intent.extras
        val name = extras?.getString("NAME","")
        var email = extras?.getString("EMAIL","")
        var address = extras?.getString("ADDRESS","")
        var phone =extras?.getString("PHONE_NUMBER","")
        var image = binding.imgDisplay

        Toast.makeText(this,"$name: $email",Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        binding.tvname1.text=name
        binding.tvPhonenum.text=phone
        binding.tvEmaill.text=email
        binding.tvLocation.text=address
        Picasso.get().load(intent.getStringExtra("IMAGE"))
            .resize(500,500)
            .centerCrop()
            .into(image)
    }
}
package dev.akuot.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.akuot.mycontacts.databinding.ActivityMainBinding
import dev.akuot.mycontacts.databinding.ActivityViewContactBinding
import dev.akuot.mycontacts.databinding.ContactListItemBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
//        var binding= ContactListItemBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        binding=ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras =intent.extras
        val name = extras?.getString("NAME","")
//        var email = extras?.getString("EMAIL","")
//        var address = extras?.getString("ADDRESS","")
        var phone =extras?.getString("PHONE_NUMBER","")
        var image = extras?.getString("IMAGE","")

        Toast.makeText(this,"$name: $phone ",Toast.LENGTH_LONG).show()
        binding.tvContactName.text=name
        binding.tvcontactNumber.text=phone

        Picasso.get().load(image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(500,500)
            .centerCrop()
            .into(binding.ivContimg)
    }
}
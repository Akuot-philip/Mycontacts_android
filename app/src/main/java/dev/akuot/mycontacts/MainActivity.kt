package dev.akuot.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.akuot.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dispayContacts()
    }
    fun dispayContacts(){
        var contact1 =Contacts("Philip","0722864325","philip@gmail.com","123 Nairobi","https://images.unsplash.com/photo-1531384441138-2736e62e0919?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact2=Contacts("Cecilia","0712864325","cecilia@gmail.com","123 Nairobi","229b29feb0d5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact3 =Contacts("Grace","0734864325","grace@gmail.com","123 Nairobi","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact4 =Contacts("Manini","0756864325","manini@gmail.com","123 Nairobi","https://media.istockphoto.com/photos/latin-american-young-adult-man-playing-online-game-with-mobile-phone-picture-id1330342607?k=20&m=1330342607&s=170667a&w=0&h=FyVHCyR7pLcfLBGu2v-PU-toalF1972O2RHx49FKGPQ=")
        var contact5 =Contacts("Philo","0778864325","phil0@gmail.com","123 Nairobi","https://images.unsplash.com/photo-1522512115668-c09775d6f424?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDEzfHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60")
        var contact6 =Contacts("Monday","0799864325","monday@gmail.com","123 Nairobi","https://images.unsplash.com/photo-1589317621382-0cbef7ffcc4c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80")
        var contactlist= listOf(contact1,contact2,contact3,contact4,contact5,contact6)
        var  contactsAdapter =ContactsRvAdapter(contactlist)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactsAdapter




}
    fun main(){
        myFloat()

    }    }

     fun myFloat(){
      var number: Float=4.5F
         print("Akuot"+number)
}
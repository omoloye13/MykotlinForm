package com.folashade.myform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var createNAButton: Button = findViewById(R.id.createNewAccount)

        createNAButton.setOnClickListener{
            val intent = Intent (this, CreateNewAccountActivity::class.java)
            this.startActivity(intent)
        }
        val loginButton :Button = this.findViewById(R.id.loginButton)
        val userName : EditText = this.findViewById(R.id.edit_text1)
        val password : EditText = this.findViewById(R.id.edit_text2)

         fun validateUserInput(){
            val enteredUserName : String = userName.text.toString()
            val enteredPassword : String = password.text.toString()
             val message = "You need to enter your username and password";


             if (enteredUserName.isNotEmpty() && enteredPassword.isNotEmpty()){
                 val navigation = Intent ( this, HomeActivity::class.java)
                 this.startActivity(navigation)
             } else{
                 Snackbar
                     .make(findViewById(R.id.content),
                         message,
                         Snackbar.LENGTH_LONG
                         )
                     .show()


             }
        }
        loginButton.setOnClickListener {

            validateUserInput()
        }
    }
}
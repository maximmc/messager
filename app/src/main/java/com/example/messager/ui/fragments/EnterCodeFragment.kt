package com.example.messager.ui.fragments

import androidx.fragment.app.Fragment
import com.example.messager.R
import com.example.messager.activities.MainActivity
import com.example.messager.activities.RegisterActivity
import com.example.messager.utils.AppTextWatcher
import com.example.messager.utils.replaceActivity
import com.example.messager.utils.showToast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.fragment_enter_code.*

class EnterCodeFragment() : Fragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
        edit_text_enter_code.addTextChangedListener(AppTextWatcher{
                val string = edit_text_enter_code.text.toString()
                if(string.length == 6) {
                    enterCode()
                }
        })
    }

    private fun enterCode() {
        showToast(getString(R.string.register_toast_code_accepted))
    }
}
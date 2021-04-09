package com.example.messager.ui.fragments

import androidx.fragment.app.Fragment
import com.example.messager.activities.MainActivity
import com.example.messager.R
import com.example.messager.activities.RegisterActivity
import com.example.messager.utils.replaceActivity
import com.example.messager.utils.replaceFragment
import com.example.messager.utils.showToast
import com.google.firebase.FirebaseException
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.fragment_enter_phone_number.*
import java.util.concurrent.TimeUnit

class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {

    override fun onStart() {
        super.onStart()
        register_btn_next.setOnClickListener({ SendCode() })
    }

    private fun SendCode() {
        if (edit_text_phone_number.text.toString().isEmpty()) {
            showToast(getString(R.string.register_toast_empty_phone))
        } else {
            replaceFragment(EnterCodeFragment())
        }
    }
}
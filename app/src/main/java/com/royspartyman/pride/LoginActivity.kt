package com.royspartyman.pride

import android.os.Bundle
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val gradientDrawable = GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                intArrayOf(ContextCompat.getColor(this, R.color.red), ContextCompat.getColor(this, R.color.orange), ContextCompat.getColor(this, R.color.yellow), ContextCompat.getColor(this, R.color.green), ContextCompat.getColor(this, R.color.blue), ContextCompat.getColor(this, R.color.indigo), ContextCompat.getColor(this, R.color.violet)))

        background_layout_login.background = gradientDrawable

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = this.resources.getColor(android.R.color.transparent)
            window.navigationBarColor = this.resources.getColor(android.R.color.transparent)
            window.setBackgroundDrawable(gradientDrawable)
        }

    }
}

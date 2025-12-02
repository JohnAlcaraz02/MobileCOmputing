package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        firebaseAuth = FirebaseAuth.getInstance()

        // Check if user is logged in
        val currentUser = firebaseAuth.currentUser
        if (currentUser == null) {
            // User not logged in, redirect to MainActivity
            navigateToLogin()
            return
        }

        // Initialize views
        val textUserName = findViewById<TextView>(R.id.textUserName)
        val textUserId = findViewById<TextView>(R.id.textUserId)
        val btnMenu = findViewById<ImageView>(R.id.btnMenu)
        val btnBindNow = findViewById<Button>(R.id.btnBindNow)
        val btnSeeAllServices = findViewById<Button>(R.id.btnSeeAllServices)
        val cardPrintRequest = findViewById<CardView>(R.id.cardPrintRequest)
        val cardSuppliesGranting = findViewById<CardView>(R.id.cardSuppliesGranting)
        val cardHygieneKits = findViewById<CardView>(R.id.cardHygieneKits)
        val cardBorrowEquipment = findViewById<CardView>(R.id.cardBorrowEquipment)
        val fabCenter = findViewById<FloatingActionButton>(R.id.fabCenter)

        // Bottom navigation views
        val navHome = findViewById<LinearLayout>(R.id.navHome)
        val navServices = findViewById<LinearLayout>(R.id.navServices)
        val navNotifications = findViewById<LinearLayout>(R.id.navNotifications)
        val navLogout = findViewById<LinearLayout>(R.id.navLogout)

        // Set user information
        val displayName = currentUser.displayName ?: "User"
        val userId = currentUser.uid.substring(0, 5).uppercase()
        textUserName.text = displayName
        textUserId.text = "ID-$userId"

        // Menu button click
        btnMenu.setOnClickListener {
            Toast.makeText(this, "Menu clicked", Toast.LENGTH_SHORT).show()
        }

        // Bind Now button click
        btnBindNow.setOnClickListener {
            Toast.makeText(this, "Bind Now clicked", Toast.LENGTH_SHORT).show()
        }

        // See All Services button click
        btnSeeAllServices.setOnClickListener {
            Toast.makeText(this, "See All Services clicked", Toast.LENGTH_SHORT).show()
        }

        // Print Request card click
        cardPrintRequest.setOnClickListener {
            Toast.makeText(this, "Print Request clicked", Toast.LENGTH_SHORT).show()
        }

        // Supplies Granting card click
        cardSuppliesGranting.setOnClickListener {
            Toast.makeText(this, "Supplies Granting clicked", Toast.LENGTH_SHORT).show()
        }

        // Hygiene Kits card click
        cardHygieneKits.setOnClickListener {
            Toast.makeText(this, "Hygiene Kits clicked", Toast.LENGTH_SHORT).show()
        }

        // Borrow Equipment card click
        cardBorrowEquipment.setOnClickListener {
            Toast.makeText(this, "Borrow Equipment clicked", Toast.LENGTH_SHORT).show()
        }

        // FAB Center click
        fabCenter.setOnClickListener {
            Toast.makeText(this, "Center logo clicked", Toast.LENGTH_SHORT).show()
        }

        // Bottom Navigation clicks
        navHome.setOnClickListener {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
        }

        navServices.setOnClickListener {
            Toast.makeText(this, "Services", Toast.LENGTH_SHORT).show()
        }

        navNotifications.setOnClickListener {
            Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show()
        }

        navLogout.setOnClickListener {
            firebaseAuth.signOut()
            navigateToLogin()
        }
    }

    private fun navigateToLogin() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()
    }
}

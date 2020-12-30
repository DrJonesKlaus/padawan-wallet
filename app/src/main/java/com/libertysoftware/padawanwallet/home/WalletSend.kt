package com.libertysoftware.padawanwallet.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.libertysoftware.padawanwallet.R
import com.libertysoftware.padawanwallet.databinding.FragmentWalletSendBinding

class WalletSend : Fragment() {

    private lateinit var binding: FragmentWalletSendBinding
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWalletSendBinding.inflate(inflater, container, false)
        val view: View = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        binding.button5.setOnClickListener {
            navController.navigate(R.id.action_walletSend_to_walletHome)
        }

        binding.buttonVerify.setOnClickListener {
            navController.navigate(R.id.action_walletSend_to_walletVerify)
        }
    }
}
package com.example.cryptoapp.ui.home


import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.cryptoapp.base.BaseFragment
import com.example.cryptoapp.databinding.FragmentHomeBinding
import com.example.cryptoapp.utils.Constants.API_KEY
import com.example.cryptoapp.utils.Constants.LIMIT
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val viewModel by viewModels<HomeViewModel>()

    override fun onCreateFinished() {
        viewModel.getData(API_KEY, LIMIT)

    }

    override fun initializeListeners() {

    }

    fun initializeListener() {

    }

    override fun observeEvents() {

    }

}
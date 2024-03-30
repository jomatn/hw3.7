package com.example.hw37

import MusicAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hw37.databinding.FragmentMusicBinding


class MusicFragment : Fragment(), MusicClickListener {
    private lateinit var binding: FragmentMusicBinding
    private lateinit var adapter: MusicAdapter

    private val musicList = arrayListOf(
        Music("Euphoria", "BTS", "3:49"),
        Music("Her", "BTS", "3:17"),
        Music("DNA", "BTS", "3:43"),
        Music("IDOL", "BTS", "3:43"),
        Music("Magic shop", "BTS", "4:46"),
        Music("Go Go", "BTS", "3:56"),
        Music("Mic Drop", "BTS", "3:58"),
        Music("FAKE LOVE", "BTS", "3:59"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = MusicAdapter(musicList)
        binding.rvMusic.adapter = adapter
        binding.rvMusic.layoutManager = GridLayoutManager(requireContext(), 1)
    }

    override fun onMusicClicked(position: Int) {
        val intent = Intent(requireContext(), SecondActivity::class.java)
        startActivity(intent)
    }
}
}
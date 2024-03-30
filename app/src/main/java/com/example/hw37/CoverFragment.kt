package com.example.hw37


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.hw37.databinding.FragmentCoverBinding

class CoverFragment : Fragment() {
    private lateinit var binding: FragmentCoverBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCoverBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cover = Cover("https://musicscore.ms/uploads/musicscore/album_covers/bts-love-yourself--tear-2018-24720.jpg", "Love Yourself", "Tear")
        setCover(cover)
    }

    private fun setCover(cover: Cover) {
        Glide.with(this)
        .load(this).into(binding.ivCover)
        binding.tvAlbum.text = cover.album
        binding.tvTitle.text = cover.title

    }
}

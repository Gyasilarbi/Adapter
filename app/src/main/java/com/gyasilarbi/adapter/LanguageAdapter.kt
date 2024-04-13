package com.gyasilarbi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gyasilarbi.adapter.databinding.ItemLanguageBinding

class LanguageAdapter(
    private val languages: List<ProgrammingLanguage>,
    private val onItemClicked: ((language: ProgrammingLanguage) -> Unit)
) : RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder =
        LanguageViewHolder(
            ItemLanguageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val currentLanguage = languages[position]
        holder.bindData(currentLanguage)
    }

    override fun getItemCount() = languages.size

    inner class LanguageViewHolder(private val binding: ItemLanguageBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(language: ProgrammingLanguage) {

            binding.languageName.text = language.name

            binding.root.setOnClickListener {
                onItemClicked(language)
            }
        }
    }
}
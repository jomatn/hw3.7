import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw37.Music
import com.example.hw37.databinding.MusicItemBinding

class MusicAdapter(private val musicList: List<Music>) :
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val binding = MusicItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MusicViewHolder(binding)
    }

    override fun getItemCount(): Int = musicList.size

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(musicList[position])
    }

    class MusicViewHolder(private val binding: MusicItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(music: Music) {
            binding.apply {
                tvName.text = music.name
                tvAuthor.text = music.author
                tvTime.text = music.time
            }
        }
    }
}

package cl.awakelab.sprint5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.sprint5.databinding.ItemLayoutBinding
import coil.load

class Adaptador: RecyclerView.Adapter <Adaptador.ViewHolder>() {
    var zapatos = mutableListOf<Zapato>()
    var callback: ZapatoCallback ?= null

    fun setZapatoCallback(c: InicioFragment){
        this.callback = c
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adaptador.ViewHolder {
       var binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adaptador.ViewHolder, position: Int) {
        val item = zapatos[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return zapatos.size
    }

    fun setData(listaZapatos: List<Zapato>){
        this.zapatos = listaZapatos.toMutableList()
    }
    inner class ViewHolder (val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(zapato: Zapato){
            val texto = "Zapato: ${zapato.nombre},  Precio: ${zapato.precio}"
            binding.tvNombre.text = zapato.nombre
            binding.imageView.load(zapato.imgUrl)
            binding.cardView.setOnClickListener(View.OnClickListener {
                callback?.showZapato(texto)
            })
        }
    }
}

interface ZapatoCallback {
    fun showZapato(texto: String)
}

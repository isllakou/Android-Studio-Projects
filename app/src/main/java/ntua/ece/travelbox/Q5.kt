package ntua.ece.travelbox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlin.system.exitProcess

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Q5 : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.q5_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_home).setOnClickListener {
            findNavController().navigate(R.id.action_Q5_to_FirstFragment)
        }

        view.findViewById<Button>(R.id.next_Q5).setOnClickListener {
            findNavController().navigate(R.id.action_Q5_to_Q6)
        }
        view.findViewById<Button>(R.id.previous_Q5).setOnClickListener {
            findNavController().navigate(R.id.action_Q5_to_Q4)
        }

    }
}
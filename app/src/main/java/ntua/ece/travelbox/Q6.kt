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
class Q6 : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.q6_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_home).setOnClickListener {
            findNavController().navigate(R.id.action_Q6_to_FirstFragment)
        }
        view.findViewById<Button>(R.id.next_Q6).setOnClickListener {
            findNavController().navigate(R.id.action_Q6_to_Q7)
        }
        view.findViewById<Button>(R.id.previous_Q6).setOnClickListener {
            findNavController().navigate(R.id.action_Q6_to_Q5)
        }


    }
}
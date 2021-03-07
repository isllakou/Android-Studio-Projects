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
class Payment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.payment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_home).setOnClickListener {
            findNavController().navigate(R.id.action_Payment_to_FirstFragment)
        }
        view.findViewById<Button>(R.id.pay).setOnClickListener {
            findNavController().navigate(R.id.action_Payment_to_End)
        }


    }
}
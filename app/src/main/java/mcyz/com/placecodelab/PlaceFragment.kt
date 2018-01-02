package mcyz.com.placecodelab

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.common.api.Status
import com.google.android.gms.location.places.Place
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment
import com.google.android.gms.location.places.ui.PlaceSelectionListener

class PlaceFragment : Fragment(){

    var localIndex = ""

    companion object {
        fun newInstance() : PlaceFragment{
            return PlaceFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_place, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        val fragment = fragmentManager
                        .findFragmentById(R.id.place_autocomplete_fragment)
                        as PlaceAutocompleteFragment?
        fragment?.let {
            fragment.setOnPlaceSelectedListener(object : PlaceSelectionListener{
                override fun onPlaceSelected(p0: Place?) {

                }

                override fun onError(p0: Status?) {
                    //TODO Implement the error
                }

            })
        }



    }
}
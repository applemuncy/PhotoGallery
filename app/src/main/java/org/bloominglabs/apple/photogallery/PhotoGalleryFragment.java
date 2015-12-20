package org.bloominglabs.apple.photogallery;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by apple on 12/20/15.
 *
 */
public class PhotoGalleryFragment extends Fragment {
    private RecyclerView mPhoroRecyclerView;

    public static PhotoGalleryFragment newInstance{
        return new PhotoGalleryFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_photo_gallery, container, false);

        mPhoroRecyclerView = (RecyclerView) v
                .findViewById(R.id.fragment_photo_gallery_recycler_view);
        mPhoroRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        return v;
    }
}

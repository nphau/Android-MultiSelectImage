package io.yostajsc.gallery;


import android.view.View;
import android.widget.ImageView;

import in.lxltech.customgallery.R;

/**
 * Created by pradeepkumar on 8/1/2016.
 */
public class ViewHolder {
    ImageView imageView, tickMark;

    ViewHolder(View view){
        imageView = (ImageView) view.findViewById(R.id.galleryImageView);
        tickMark = (ImageView) view.findViewById(R.id.tickMark);
    }
}

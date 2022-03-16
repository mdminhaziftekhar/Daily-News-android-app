package com.dailynews.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.dailynews.R;
import com.dailynews.databinding.FragmentSlideshowBinding;
import com.dailynews.webViewController;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        WebView webView = root.findViewById(R.id.webViewCNN);

        webView.loadUrl("https://edition.cnn.com/world");

        webView.setWebViewClient(new webViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
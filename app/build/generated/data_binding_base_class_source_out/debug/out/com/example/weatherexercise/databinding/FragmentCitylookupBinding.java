// Generated by view binder compiler. Do not edit!
package com.example.weatherexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.weatherexercise.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCitylookupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputLayout cityNameField;

  @NonNull
  public final Button lookUpButton;

  private FragmentCitylookupBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputLayout cityNameField, @NonNull Button lookUpButton) {
    this.rootView = rootView;
    this.cityNameField = cityNameField;
    this.lookUpButton = lookUpButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCitylookupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCitylookupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_citylookup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCitylookupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.city_name_field;
      TextInputLayout cityNameField = ViewBindings.findChildViewById(rootView, id);
      if (cityNameField == null) {
        break missingId;
      }

      id = R.id.lookUpButton;
      Button lookUpButton = ViewBindings.findChildViewById(rootView, id);
      if (lookUpButton == null) {
        break missingId;
      }

      return new FragmentCitylookupBinding((ConstraintLayout) rootView, cityNameField,
          lookUpButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

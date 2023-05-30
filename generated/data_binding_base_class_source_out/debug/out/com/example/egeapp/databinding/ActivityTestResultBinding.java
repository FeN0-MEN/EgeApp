// Generated by view binder compiler. Do not edit!
package com.example.egeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.egeapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTestResultBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView CongratulationsTextView;

  @NonNull
  public final TextView ResultTextView;

  @NonNull
  public final TextView ScoreTextView;

  @NonNull
  public final Button buttonOk;

  @NonNull
  public final TextView textView4;

  private ActivityTestResultBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView CongratulationsTextView, @NonNull TextView ResultTextView,
      @NonNull TextView ScoreTextView, @NonNull Button buttonOk, @NonNull TextView textView4) {
    this.rootView = rootView;
    this.CongratulationsTextView = CongratulationsTextView;
    this.ResultTextView = ResultTextView;
    this.ScoreTextView = ScoreTextView;
    this.buttonOk = buttonOk;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTestResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTestResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_test_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTestResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CongratulationsTextView;
      TextView CongratulationsTextView = ViewBindings.findChildViewById(rootView, id);
      if (CongratulationsTextView == null) {
        break missingId;
      }

      id = R.id.ResultTextView;
      TextView ResultTextView = ViewBindings.findChildViewById(rootView, id);
      if (ResultTextView == null) {
        break missingId;
      }

      id = R.id.ScoreTextView;
      TextView ScoreTextView = ViewBindings.findChildViewById(rootView, id);
      if (ScoreTextView == null) {
        break missingId;
      }

      id = R.id.buttonOk;
      Button buttonOk = ViewBindings.findChildViewById(rootView, id);
      if (buttonOk == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityTestResultBinding((ConstraintLayout) rootView, CongratulationsTextView,
          ResultTextView, ScoreTextView, buttonOk, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

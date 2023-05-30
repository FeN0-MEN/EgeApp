// Generated by view binder compiler. Do not edit!
package com.example.egeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
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

public final class ActivityTestBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText AnswerEditText;

  @NonNull
  public final TextView TextTask;

  @NonNull
  public final Button buttonBack;

  @NonNull
  public final Button buttonDownload;

  @NonNull
  public final Button buttonExit;

  @NonNull
  public final Button buttonNext;

  @NonNull
  public final ImageView imageBox;

  @NonNull
  public final ScrollView scrollView2;

  private ActivityTestBinding(@NonNull ConstraintLayout rootView, @NonNull EditText AnswerEditText,
      @NonNull TextView TextTask, @NonNull Button buttonBack, @NonNull Button buttonDownload,
      @NonNull Button buttonExit, @NonNull Button buttonNext, @NonNull ImageView imageBox,
      @NonNull ScrollView scrollView2) {
    this.rootView = rootView;
    this.AnswerEditText = AnswerEditText;
    this.TextTask = TextTask;
    this.buttonBack = buttonBack;
    this.buttonDownload = buttonDownload;
    this.buttonExit = buttonExit;
    this.buttonNext = buttonNext;
    this.imageBox = imageBox;
    this.scrollView2 = scrollView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_test, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AnswerEditText;
      EditText AnswerEditText = ViewBindings.findChildViewById(rootView, id);
      if (AnswerEditText == null) {
        break missingId;
      }

      id = R.id.TextTask;
      TextView TextTask = ViewBindings.findChildViewById(rootView, id);
      if (TextTask == null) {
        break missingId;
      }

      id = R.id.buttonBack;
      Button buttonBack = ViewBindings.findChildViewById(rootView, id);
      if (buttonBack == null) {
        break missingId;
      }

      id = R.id.buttonDownload;
      Button buttonDownload = ViewBindings.findChildViewById(rootView, id);
      if (buttonDownload == null) {
        break missingId;
      }

      id = R.id.buttonExit;
      Button buttonExit = ViewBindings.findChildViewById(rootView, id);
      if (buttonExit == null) {
        break missingId;
      }

      id = R.id.buttonNext;
      Button buttonNext = ViewBindings.findChildViewById(rootView, id);
      if (buttonNext == null) {
        break missingId;
      }

      id = R.id.imageBox;
      ImageView imageBox = ViewBindings.findChildViewById(rootView, id);
      if (imageBox == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      return new ActivityTestBinding((ConstraintLayout) rootView, AnswerEditText, TextTask,
          buttonBack, buttonDownload, buttonExit, buttonNext, imageBox, scrollView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

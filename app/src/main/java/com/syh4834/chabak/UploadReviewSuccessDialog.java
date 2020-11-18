package com.syh4834.chabak;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

public class UploadReviewSuccessDialog extends Dialog {
    //init
    private TextView tvLendModelNum;
    private TextView tvLendTime;
    private Context context;

    public UploadReviewSuccessDialog(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_upload_review_success);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                dismiss();
                Log.e("upload", "success");
            }
        }, 3000);
    }
}

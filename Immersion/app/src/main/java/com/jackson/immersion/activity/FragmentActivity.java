package com.jackson.immersion.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.jackson.immersion.R;
import com.jackson.immersion.fragment.Fragment1;
import com.jackson.immersion.fragment.Fragment2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentActivity extends AppCompatActivity {

    @BindView(R.id.realtabcontent)
    FrameLayout mRealtabcontent;
    @BindView(R.id.img1)
    ImageView mImg1;
    @BindView(R.id.ll1)
    LinearLayout mLl1;
    @BindView(R.id.img2)
    ImageView mImg2;
    @BindView(R.id.ll2)
    LinearLayout mLl2;

    private Fragment1 mFragment1;
    private Fragment2 mFragment2;

    // Fragment管理器，和执行器
    private FragmentManager mManager;
    private FragmentTransaction mTransaction;

    @OnClick(R.id.ll1)
    public void one(){
        setChoiceFragment(0);
    }

    @OnClick(R.id.ll2)
    public void two(){
        setChoiceFragment(1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        ButterKnife.bind(this);
        initView();
    }

    private void initView(){
        mFragment1 = new Fragment1();
        mManager = getSupportFragmentManager();
        mTransaction = mManager.beginTransaction();
        mTransaction.add(R.id.realtabcontent, mFragment1).commit();
    }

    public void setChoiceFragment(int index) {
        mTransaction = mManager.beginTransaction();
        hideFragment(mTransaction);
        switch (index) {
            case 0:
                if (mFragment1 == null) {
                    mFragment1 = new Fragment1();
                    mTransaction.add(R.id.realtabcontent,
                            mFragment1);
                } else {
                    mTransaction.show(mFragment1);
                }
                break;
            case 1:
                if (mFragment2 == null) {
                    mFragment2 = new Fragment2();
                    mTransaction.add(R.id.realtabcontent,
                            mFragment2);
                } else {
                    mTransaction.show(mFragment2);
                }

                break;

        }
//        mTransaction.commit();
        //Can not perform this action after onSaveInstanceState
        mTransaction.commitAllowingStateLoss();
    }

    /**
     * 隐藏所有fragment
     *
     * @param transaction
     */
    public void hideFragment(FragmentTransaction transaction) {

        if (mFragment1 != null) {
            transaction.hide(mFragment1);
        }
        if (mFragment2 != null) {
            transaction.hide(mFragment2);
        }

    }
}

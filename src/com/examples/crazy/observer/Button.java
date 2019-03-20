package com.examples.crazy.observer;

public class Button {

    // notify
    public void onClick() {
        // 이벤트 처리
        if(onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    // observer interface
    // 실제로는 많은 옵저버 패턴이 내부에서 정의가 된다.
    public interface OnClickListener {
        public void onClick(Button button);
    }

    private OnClickListener onClickListener;

    // setObserver
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}

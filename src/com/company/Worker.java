package com.company;

public class Worker implements OnTaskDoneListener, OnTaskErrorListener {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    @Override
    public void onDone(String result) {

    }

    @Override
    public void onError(String result) {

    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 32) {
                errorCallback.onError("Задача " + (i + 1) + " - ошибка!!!");
                continue;
            }
            callback.onDone("Задача " + (i + 1) + " - выполнена");
        }
    }
}

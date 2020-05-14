package com.example.jetpack.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @Author godv
 * Date on 2020/5/14  16:07
 */
public class DataBindingViewModel extends ViewModel {
    private MutableLiveData<Integer> ticketCxk, ticketJay;

    public MutableLiveData<Integer> getTicketCxk() {
        if (ticketCxk == null) {
            ticketCxk = new MutableLiveData<>();
            ticketCxk.setValue(0);
        }
        return ticketCxk;
    }

    public MutableLiveData<Integer> getTicketJay() {
        if (ticketJay == null) {
            ticketJay = new MutableLiveData<>();
            ticketJay.setValue(0);
        }
        return ticketJay;
    }

    public void addCxk() {
        ticketCxk.setValue(ticketCxk.getValue() + 1);
    }

    public void addJay() {
        ticketJay.setValue(ticketJay.getValue() + 1);
    }
}

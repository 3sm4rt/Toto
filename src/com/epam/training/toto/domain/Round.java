package com.epam.training.toto.domain;

import java.time.LocalDate;
import java.util.List;

public class Round {

    public int year;
    public int week;
    public int roundOfWeek;
    public LocalDate date;
    public List<Outcome> outcomes;
    public List<Hit> hist;

    public Round(int year, int week, int roundOfWeek, LocalDate date, List<Outcome> outcomes, List<Hit> hist) {
        this.year = year;
        this.week = week;
        this.roundOfWeek = roundOfWeek;
        this.date = date;
        this.outcomes = outcomes;
        this.hist = hist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getRoundOfWeek() {
        return roundOfWeek;
    }

    public void setRoundOfWeek(int roundOfWeek) {
        this.roundOfWeek = roundOfWeek;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Outcome> getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(List<Outcome> outcomes) {
        this.outcomes = outcomes;
    }

    public List<Hit> getHist() {
        return hist;
    }

    public void setHist(List<Hit> hist) {
        this.hist = hist;
    }
}

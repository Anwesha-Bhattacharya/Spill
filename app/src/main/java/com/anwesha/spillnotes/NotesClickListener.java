package com.anwesha.spillnotes;

import androidx.cardview.widget.CardView;

import com.anwesha.spillnotes.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);

    void onLongClick(Notes notes, CardView cardView);
}


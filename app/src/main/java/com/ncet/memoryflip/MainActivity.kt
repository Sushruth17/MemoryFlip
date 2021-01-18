package com.ncet.memoryflip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ncet.memoryflip.adapter.MemoryBoardAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var rvBoard: RecyclerView
    private lateinit var numberMoves: TextView
    private lateinit var numberPairs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBoard = findViewById(R.id.rvBoard)
        numberMoves = findViewById(R.id.numberMoves)
        numberPairs = findViewById(R.id.numberPairs)

        rvBoard.adapter = MemoryBoardAdapter(this, 8)
        rvBoard.setHasFixedSize(true)
        rvBoard.layoutManager = GridLayoutManager(this, 2)


    }
}
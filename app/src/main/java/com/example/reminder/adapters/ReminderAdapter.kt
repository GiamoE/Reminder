package com.example.reminder.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.reminder.dataClasses.Reminder


/**
 * Creates and returns a ViewHolder object, inflating a standard layout called simple_list_item_1.
 */
class ReminderAdapter(private val reminders: List<Reminder>) : RecyclerView.Adapter<ReminderAdapter.ViewHolder>() {
    /**
     * Returns the size of the list
     */
    override fun getItemCount(): Int {
        return reminders.size
    }

    /**
    * Called by RecyclerView to display the data at the specified position.
    */

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(reminders[position])
    }


    /**
     * Creates and returns a ViewHolder object, inflating a standard layout called simple_list_item_1.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        )
    }


    /**
     * Creates and returns a ViewHolder object, inflating a standard layout called simple_list_item_1.
     */


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvReminder: TextView = itemView.findViewById(android.R.id.text1)

        fun bind(reminder: Reminder) {
            tvReminder.text = reminder.reminder
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            private val tvReminder: TextView = itemView.findViewById(android.R.id.text1)

            fun bind(reminder: Reminder) {
                tvReminder.text = reminder.reminder
            }
        }
    }


}

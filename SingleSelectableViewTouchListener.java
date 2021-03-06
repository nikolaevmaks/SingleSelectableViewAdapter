import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

public class SingleSelectableViewTouchListener implements View.OnTouchListener {

	private int itemPressedPos = -1;

	@Override
	public boolean onTouch(View view, MotionEvent event) {
		final RecyclerView.ViewHolder holder = RecyclerViewAdapterUtils.getViewHolder(view);
		if (holder == null) {
			itemPressedPos = -1;
			return false;
		}
		final int position = RecyclerViewAdapterUtils.getSynchronizedPosition(holder);
		if (position == RecyclerView.NO_POSITION) {
			itemPressedPos = -1;
			return false;
		}

		final int action = event.getAction();

		if (action == MotionEvent.ACTION_DOWN) {
			if (itemPressedPos == -1) {
				itemPressedPos = position;
			} else {
				return true;
			}
		} else if (position == itemPressedPos &&
				(action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL)) {
			itemPressedPos = -1;
		}

		return false;
	}
}

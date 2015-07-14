import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

public abstract class SingleSelectableViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnTouchListener {

	private int mItemPressedPos = -1;

	@Override
	public boolean onTouch(View view, MotionEvent event) {
		final RecyclerView.ViewHolder holder = RecyclerViewAdapterUtils.getViewHolder(view);
		if (holder == null) {
			return true;
		}
		final int position = RecyclerViewAdapterUtils.getSynchronizedPosition(holder);
		if (position == RecyclerView.NO_POSITION) {
			return true;
		}

		final int action = event.getAction();

		if (action == MotionEvent.ACTION_DOWN) {
			if (mItemPressedPos == -1) {
				mItemPressedPos = position;
			} else {
				return true;
			}
		} else if (position == mItemPressedPos &&
				(action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL)) {
			mItemPressedPos = -1;
		}

		return false;
	}
}
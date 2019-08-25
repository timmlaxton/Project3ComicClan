import React from 'react';

const ReviewForm = (props) => {

  {/* Put handle submit function here and put in form tag below */}



  function handleSubmit(event) {
    event.preventDefault();
    const review = {
      "review": event.target.review.value,
      "rating": event.target.rating.value,
      "date": null,
      "comic": props.comic,
      "user": props.user
    }
    props.handleReviewPost(review);
  }

  return(
    <div className="review-box">
      <form onSubmit={handleSubmit}>
        <input name="rating" type="number" max="5" min ="1" required />
        <textarea type="text" placeholder="Comic Review" name="review" rows="8" cols="80"></textarea>

        <button type="submit">Save Review!</button>
      </form>
    </div>
  )

}

export default ReviewForm;

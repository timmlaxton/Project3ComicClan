import React from 'react';

const ReviewForm = (props) => {

  {/* Put handle submit function here and put in form tag below */}



  const handleSubmit = (event) => {
    event.preventDefault();
    const review = {
      "review": event.target.review.value,
      "comic": props.comic.id
    }
    props.handleReviewPost(review);
  }

  return(
    <div className="review-box">
      <form onSubmit={handleSubmit}>
        <textarea type="text" placeholder="Comic Review" name="review" rows="8" cols="80"></textarea>

        <button type="submit">Save Review!</button>
      </form>
    </div>
  )

}

export default ReviewForm;

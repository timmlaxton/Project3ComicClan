import React from 'react';

const PersonaInfo = (props) => {

  // if(!props.comics){
  //   return "Loading...Review Form"
  // }

  {/* Put handle submit function here and put in form tag below */}

  return(
    <div className="review-box">
      <form>
        <input type="text" placeholder="Comic Review" name="review"/>

        <button type="submit">Save Review!</button>
      </form>
    </div>
  )

}

export default ReviewForm;

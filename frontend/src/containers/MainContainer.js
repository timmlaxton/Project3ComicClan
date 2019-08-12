import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from '../NavBar.js';
import LoginPage from './users/LoginPage';
import ComicList from '../components/comics/ComicList';
import ComicDetails from '../components/comics/ComicDetails';
import PersonaList from '../components/personas/PersonaList';
import PublisherList from '../components/publishers/PublisherList';
import ReviewFormContainer from './reviews/ReviewFormContainer';
import Request from '../helpers/request';


class MainContainer extends Component {

  constructor(props){
    super(props);
    this.state = {
      comics: [],
      personas: [],
      publishers: [],
      users: [],
      reviews: [],
      currentUser: null
    };
    this.handleUserSelect = this.handleUserSelect.bind(this);
    this.findComicById = this.findComicById.bind(this);
  }


  componentDidMount(){
    const request = new Request()

    const promise1 = request.get('/api/comics');
    const promise2 = request.get('/api/characters');
    const promise3 = request.get('/api/publishers');
    const promise4 = request.get('/api/users');
    const promise5 = request.get('/api/reviews')

    const promises = [promise1, promise2, promise3, promise4, promise5];

    Promise.all(promises).then((data) => {
      console.log(data);
      this.setState({
        comics: data[0],
        personas: data[1],
        publishers: data[2],
        users: data[3],
        reviews: data[4]
      })
    })
  }

  handleUserSelect(index){
    const selectedUser = this.state.users[index]
    this.setState({currentUser: selectedUser})
    console.log(this.state.currentUser);
  }

  findComicById(id){
    const comic = this.state.comics.find((comic) => {
      return comic.id === parseInt(id)
    })
    return comic;
  }

  render(){
    return (
    <div>
      <Router>
        <React.Fragment>

          <NavBar />

          <Switch>
            {/* Login Page */}
            <Route exact path="/" render={() => {

              return <LoginPage users={this.state.users} handleUserSelect={this.handleUserSelect}/>

            }} />

            {/* Get all comics */}
            <Route exact path="/comics" render={(props) => {
              return <ComicList comics={this.state.comics}/>
            }} />

            {/* Get one comic */}
            <Route exact path="/comics/:id" render={(props) => {
              const id = props.match.params.id;
              const comic = this.findComicById(id);
              return <ComicDetails comic={comic} />
            }} />

            {/* Get all characters */}
            <Route exact path="/characters" render={(props) => {
              return <PersonaList personas={this.state.personas}/>
            }} />

            {/* Get all publishers */}
            <Route exact path="/publishers" render={(props) => {
              return <PublisherList publishers={this.state.publishers}/>
            }} />

          </Switch>
        </React.Fragment>
      </Router>
    </div>
  )
  }

}

export default MainContainer;
